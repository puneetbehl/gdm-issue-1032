package myapp

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import grails.test.mixin.integration.Integration
import grails.transaction.Rollback
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@Integration
@Rollback
class StockServiceSpec extends Specification {

    @Autowired
    StockService stockService

    void "test stock find"() {

        when: "create new stock is created"
        Stock stock = new Stock(
                name: "Oil India Limited",
                code: "OIL",
                stockId: "6668",
                newestAvailableDate: new Date(2018,2, 15),
                oldestAvailableDate: new Date(2009, 9, 30)
        )
        stockService.save(stock)

        then: "stock is created"
        stock.id != null

        when: "find stock by name"
        Stock stockFound = stockService.find("Oil India Limited")

        then: "stock is returned"
        stockFound.id == stock.id


    }
}
