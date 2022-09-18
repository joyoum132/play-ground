with recursive timeline as (
select 0 as num union all select num+1 from timeline where num < 23
)


select t.num as hour, 
(select count(animal_id) from animal_outs ao where hour(ao.datetime) = hour) as count
from timeline t
order by t.num