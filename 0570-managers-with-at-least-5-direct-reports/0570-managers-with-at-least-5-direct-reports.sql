SELECT e.name
from Employee as e
inner join (
    Select e1.managerID, count(e1.managerID)
    from Employee as e1
    group by e1.managerID
    having count(e1.managerID)>=5
) as e2
on e.id= e2.managerID