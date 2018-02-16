package myapp

import org.bson.types.ObjectId

class ExchangeRate {

    ObjectId id

    Date date
    List<String> columnNames
    Map<String, BigDecimal> data

    static mapWith = "mongo"
}
