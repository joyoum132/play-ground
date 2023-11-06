-- 코드를 입력하세요

SELECT BOOK_ID, DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') FROM BOOK 
WHERE PUBLISHED_DATE BETWEEN '2021-01-01' AND '2021-12-31' 
AND CATEGORY = '인문' 
ORDER BY PUBLISHED_DATE ASC;

# select BOOK_ID, date_format(published_date,'%y-%m-%d') as PUBLISHED_DATE 
# from book 
# where published_date between '2021-01-01' and '2021-12-31' and category='인문'
# order by published_date asc