package simple.web.app


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class PersonIntegrationSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }


    void testSavePersonToDB() {
        def deekshith = new Person(firstName: "Deekshith2", lastName:"Bandapally2", created: new Date())
        deekshith.save();

        def queryPerson = Person.findByLastName("Bandapally")
        assertEquals "Deekshith", queryPerson.firstName
    }
}
