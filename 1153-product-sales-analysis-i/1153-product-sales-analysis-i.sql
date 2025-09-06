# Write your MySQL query statement below

select pt.product_name, st.year, st.price
from sales st
join Product pt on pt.product_id = st.product_id;