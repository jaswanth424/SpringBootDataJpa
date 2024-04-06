#one-to-one relationship


Each Person is associated with only one address.

#Model
- Address-- no mapping annotations required.
- Person -- add @OneToOne () annotation on Address variable.
example:
public class Person {
    // person attributes
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_address_id")
    private Address address;


##* make sure person, person_seq, address, address_seq tables are not present in database;

##curl --location 'http://localhost:9093/person' \
--header 'Content-Type: application/json' \
--data '
[
{
"name": "Shyam",
"country": "Turkey",
"address":{
"streetNumber":1000,
"streetName":"Srilanka"
}
}
]
'

response
[
{
"person_id": 2,
"name": "Shyam",
"country": "Turkey",
"address": {
"address_id": 2,
"streetNumber": 1000,
"streetName": "Srilanka"
}
}
]
