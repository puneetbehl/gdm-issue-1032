package myapp

import grails.transaction.Transactional

@Transactional
class StockService {

    Stock save(Stock stock) {
        stock.save(failOnError: true, flush: true)
    }

    Stock find(String name) {
        Stock.findByNameIlike(name)
    }

    List<Stock> list(Map args) {
        Stock.list(args)
    }

    Integer count() {
        Stock.count()
    }
}
