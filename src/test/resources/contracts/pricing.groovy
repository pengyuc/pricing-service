package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/pricing'
        headers {
            contentType('application/json')
        }
    }
    response {
        status(200)
        body(["price": 1024])
        headers {
            contentType("application/json")
        }
    }

}