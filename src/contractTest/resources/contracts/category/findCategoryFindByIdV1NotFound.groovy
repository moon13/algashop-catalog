package contracts.order

import org.springframework.cloud.contract.spec.Contract



Contract.make {
    request{
          method GET()

         headers {

             accept "application/json"
         }

         url("/api/v1/categories/7f3a9c21-8b64-4d2e-a571-3c9e82b6f410")
    }

    response {

          status 404
          body([
                  instance: fromRequest().path(),
                  type: "/errors/not-found",
                  title : "Resource Not Found"
          ])
    }

}