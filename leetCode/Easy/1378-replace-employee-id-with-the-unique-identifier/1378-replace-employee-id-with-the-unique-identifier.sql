# Write your MySQL query statement below
select eni.unique_id, e.name
from Employees e
left join EmployeeUNI eni on eni.id = e.id