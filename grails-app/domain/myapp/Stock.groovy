package myapp

import groovy.transform.CompileStatic
import org.bson.types.ObjectId

@CompileStatic
class Stock {

    ObjectId id

    String stockId
    String code
    String name

    Date newestAvailableDate
    Date oldestAvailableDate

    List<ExchangeRate> exchangeRates

    static mapWith = "mongo"

    static embedded = ['exchangeRates']
}
