-- 코드를 입력하세요
SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, 
CASE
	WHEN freezer_yn is null THEN 'N'
    ELSE freezer_yn
END as 'FREEZER_YN'
from FOOD_WAREHOUSE where address like '경기%';