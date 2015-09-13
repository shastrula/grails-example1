package simple.web.app

class Person {
    def scaffold = true
    String firstName
    String lastName
    List<Address> addresses
    Integer creditScore
    String decision
    Date created

    static hasMany = [addresses:Address]

    static constraints = {
        firstName(nullable:false)
        lastName(nullable:false)
        creditScore(nullable: true)
        decision(nullable: true)
        created(nullable:false)
    }

}
