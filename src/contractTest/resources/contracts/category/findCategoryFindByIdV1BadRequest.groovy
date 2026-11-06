package contracts.order

import org.springframework.cloud.contract.spec.Contract



Contract.make {

        request {
            method POST()

            url "/api/v1/categories"

            headers {
                contentType("application/json")
            }

            body(
                    name: "",
                    enabled: "null"
            )
        }

        response {
            status 400

            headers {
                contentType("application/problem+json")
            }

            body(
                    type: "/errors/invalid-fields",
                    title: "Invalid fields",
                    status: 400,
                    detail: "One or more fields are invalid",
                    instance: "/api/v1/categories",
                    fields: [
                            name: "must not be blank",
                            enabled: "must not be null"
                    ]
            )
        }
    }