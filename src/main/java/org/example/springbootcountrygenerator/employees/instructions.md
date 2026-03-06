# Java Exercise: Fetching & Storing Users from JSONPlaceholder

## API
We will be using this endpoint:
```
https://jsonplaceholder.typicode.com/users
```
It returns a list of users. Each user looks like this:
```json
{
  "id": 1,
  "name": "Leanne Graham",
  "username": "Bret",
  "email": "Sincere@april.biz",
  "phone": "1-770-736-0988",
  "website": "hildegard.org",
  "address": {
    "street": "Kulas Light",
    "city": "Gwenborough",
    "zipcode": "92998-3874"
  },
  "company": {
    "name": "Romaguera-Crona",
    "catchPhrase": "Multi-layered client-server neural-net"
  }
}
```

---

## Phase 1 — Create the POJOs

You need **3 classes** to model this response.

### `Address.java`
Map only these fields:
- `street`
- `city`
- `zipcode`

### `Company.java`
Map only these fields:
- `name`
- `catchPhrase`

### `Employee.java`
This is the main class. It should contain:
- `id` (int)
- `name`
- `username`
- `email`
- `phone`
- `address` — of type `Address`
- `company` — of type `Company`

> All fields should be **private** with getters and setters. You can use Lombok if you want.

Once your POJOs are ready, fetch a **single user** to test it works:
```
https://jsonplaceholder.typicode.com/users/1
```

---

## Phase 2 — Save All Users to a Database

Now fetch **all users** from the API and save them to your database.

The endpoint returns an array of 10 users:
```
https://jsonplaceholder.typicode.com/users
```

Steps:
1. Set up a `Employee` JPA entity (add `@Entity`, `@Id` etc.)
2. Create a `EmployeeRepository` that extends `JpaRepository`
3. In your service, fetch all users as `Employee[]` using `RestTemplate`
4. Loop through the array and save each one using the repository
5. Call this from a controller endpoint like `POST /employees/fetch`

The loop in your service should look roughly like this:
```java
Employee[] employees = restTemplate.getForObject(API_URL, Employee[].class);
for (Employee employee : employees) {
    employeeRepository.save(employee);
}
```

> Think about what happens with `Address` and `Company` inside the entity —
> should they be separate tables or embedded? Look into `@Embedded` and `@Embeddable`.
