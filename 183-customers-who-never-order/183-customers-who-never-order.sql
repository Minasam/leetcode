# Write your MySQL query statement below
select name as Customers from Customers where (select count(*) from Orders where Orders.customerId = Customers.id)=0