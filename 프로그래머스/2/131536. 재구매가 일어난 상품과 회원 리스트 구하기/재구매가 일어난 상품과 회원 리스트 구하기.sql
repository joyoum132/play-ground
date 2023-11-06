#재구매한 회원아이디, 재구매한 상품 아이디
select user_id, product_id from online_sale
group by user_id, product_id
having count(*)>1
order by user_id, product_id desc