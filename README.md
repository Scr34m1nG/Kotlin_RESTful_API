# API Spec

## Create Product

request :
- Method : POST
- Endpoint : `/api/products`
- Header :
  - Content-Type: application/json
  - Accept: application/json
- Body :
```json
{
  "code" : "number",
  "status" : "string",
  "data" : {
    "id" : "string, unique",
    "name" : "string",
    "price" : "long",
    "quantity" : "integer",
    "createdAt" : "date"
  }
}
```
- Response :
```json
{
  "id" : "string, unique",
  "name" : "string",
  "price" : "long",
  "quantity" : "integer",
  "createdAt" : "date"
}
```

## Get Product

request :
- Method : GET
- Endpoint : `/api/products/{id_product}`
- Header :
  - Accept: application/json
- Response :
```json
{
  "code" : "number",
  "status" : "string",
  "data" : {
    "id" : "string, unique",
    "name" : "string",
    "price" : "long",
    "quantity" : "integer",
    "createdAt" : "date"
  }
}
```

## Update Product

request :
- Method : PUT
- Endpoint : `/api/products/{id_product}`
- Header :
  - Content-Type: application/json
  - Accept: application/json
- Body :
```json
{
  "name" : "string",
  "price" : "long",
  "quantity" : "integer"
}
```
- Response :
```json
{
  "code" : "number",
  "status" : "string",
  "data" : {
    "id" : "string, unique",
    "name" : "string",
    "price" : "long",
    "quantity" : "integer",
    "createdAt" : "date",
    "updateAt" : "date"
  }
}
```

## List Product

request :
- Method : GET
- Endpoint : `/api/products/`
- Header :
  - Accept: application/json
- Query Param :
  - pageSize : number
  - page : number
  
- Response :
```json
{
  "code" : "number",
  "status" : "string",
  "data" : [
    {
      "id" : "string, unique",
      "name" : "string",
      "price" : "long",
      "quantity" : "integer",
      "createdAt" : "date",
      "updateAt" : "date"
    },
    {
      "id" : "string, unique",
      "name" : "string",
      "price" : "long",
      "quantity" : "integer",
      "createdAt" : "date",
      "updateAt" : "date"
    }
  ]
}
```

## Delete Product
request :
- Method : DELETE
- Endpoint : `/api/products/{id_product}`
- Header :
  - Accept: application/json
- Response :
```json
{
  "code" : "number",
  "status" : "string"
}
```
