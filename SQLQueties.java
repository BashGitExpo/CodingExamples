








//  What are the different types of JOINs in SQL?


// INNER JOIN: Returns matching rows in both tables.
// LEFT JOIN: Returns all rows from the left table and matching rows from the right table.
// RIGHT JOIN: Returns all rows from the right table and matching rows from the left table.
// FULL OUTER JOIN: Returns all rows when there is a match in either table.


// What is the difference between DELETE, TRUNCATE, and DROP?

// DELETE: Removes records but retains table structure; can be rolled back.
// TRUNCATE: Deletes all rows quickly; cannot be rolled back.
// DROP: Deletes table structure and data.


-- INIT database
CREATE TABLE FamilyData (
  MemberID INT IDENTITY(1, 1),
  FullName VARCHAR(100),
  AreaName VARCHAR(100),
  Work VARCHAR(255)
);

INSERT INTO FamilyData(FullName, AreaName, Work) VALUES ('Reshma', 'NRT', 'Software Developer')
INSERT INTO FamilyData(FullName, AreaName, Work) VALUES ('Rosh', 'NRT', 'Doctor')
INSERT INTO FamilyData(FullName, AreaName, Work) VALUES ('Bash', 'VNK', 'Software Developer 2')
INSERT INTO FamilyData(FullName, AreaName, Work) VALUES ('Inth', 'VNK', 'Software Developer')



-- QUERY database
SELECT * FROM FamilyData;
SELECT * FROM FamilyData WHERE AreaName = 'NRT'

-- UPDATE 

UPDATE FamilyData 
SET AreaName = 'HYD' 
WHERE FullName = 'Reshma';

UPDATE FamilyData SET AreaName = 'HYD' WHERE FullName = 'Reshma'

SELECT * FROM FamilyData;

-- DELETE 

DELETE FROM FamilyData WHERE FullName = 'Bash';

SELECT * FROM FamilyData;
