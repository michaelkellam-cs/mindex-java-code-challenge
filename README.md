# Coding Challenge Explanation

Hi Mindex Team! Thank you for this opportunity. I've heard great things about Mindex and the work that is done here looks very
fun and interesting. I've decided to add these explanations so that you can see my thought process and how
I approach solutions for these problems.

### Task 1
For this task, I knew that I could use BFS or DFS since these `directReports` can make a tree of `Employees`.
I went with BFS because I find it easier to implement, and since the entire tree must be traversed, the performance should
be similar between both algorithms.

Using a `LinkedList` as a queue, it will add the head `Employee`, and the list of direct reports will act as the child nodes.
Then upon, then after the child nodes have been added to the queue, the queue will pop the first `Employee` in the list, and that
will now be the acting head node. This process repeats until all `Employees` have been added and eventually popped. Then, simply
add 1 to the sum counter after each iteration, and that is how many reports are tied to that specific `Employee`.

![](bfs.gif)

I decided to keep this `numberOfReports`/`ReportingStructure` objects in the `EmployeeController` and `EmployeeService`. This is because it's closely related to
the `Employee's` data. However, a case could be made to create a new controller for it, especially if there were to
be more functionality regarding `ReportingStructures`.

The time complexity of `numberOfReports()` is `O(n)`, where `n` is the number of `Employees` in the tree of the starting `Employee`.

The space complexity of `numberOfReports()` is `O(n)`, where `n` is the number of `Employees` in the tree of the starting `Employee`.
### Task 2
For the new object `Compensation`, since it's an entirely new read and write (GET and POST), I decided to make a new controller.
Since the values need to come from the persistence layer, I created a new `CompensationRepository`. Because `Compensation's`
object only needs the ID, the other fields in `Employee` are null. Because of this, in the service layer, I use the
`EmployeeRepository` to retrieve the `Employee` with the proper fields, and set this object as the returned `Compensation's` `Employee`.

That way, instead of the return object looking like this:

```
{
    "employee": {
        "employeeId": "03aa1462-ffa9-4978-901b-7c001562cf6f",
        "firstName": null,
        "lastName": null
        "position": null
        "department": null
        "directReports": null,
    },
    "salary": 34232.11,
    "effectiveDate": "now"
}

```
It looks like this:
```
{
    "employee": {
        "employeeId": "03aa1462-ffa9-4978-901b-7c001562cf6f",
        "firstName": "Ringo",
        "lastName": "Starr",
        "position": "Developer V",
        "department": "Engineering",
        "directReports": [
            {
                "employeeId": "62c1084e-6e34-4630-93fd-9153afb65309",
                "firstName": null,
                "lastName": null,
                "position": null,
                "department": null,
                "directReports": null
            },
            {
                "employeeId": "c0c2293d-16bd-4603-8e08-638a9d18b22c",
                "firstName": null,
                "lastName": null,
                "position": null,
                "department": null,
                "directReports": null
            }
        ]
    },
    "salary": 34232.11,
    "effectiveDate": "now"
}
```

The same thing was done for the read method.