CREATE SCHEMA IF NOT EXISTS intern_flow AUTHORIZATION admin;


CREATE SEQUENCE intern_flow.sq_team_id START 1;
CREATE SEQUENCE intern_flow.sq_student_id START 1;
CREATE SEQUENCE intern_flow.sq_mentor_id START 1;
CREATE SEQUENCE intern_flow.sq_attendance_id START 1;
CREATE SEQUENCE intern_flow.sq_grade_id START 1;
CREATE SEQUENCE intern_flow.sq_activity_id START 1;


CREATE TABLE IF NOT EXISTS intern_flow.Team (
    team_id BIGINT PRIMARY KEY DEFAULT NEXTVAL('intern_flow.sq_team_id'),
    team_leader_id BIGINT REFERENCES intern_flow.Student(student_id),
    registration_date timestamp WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE IF NOT EXISTS intern_flow.Student (
    student_id BIGINT PRIMARY KEY DEFAULT NEXTVAL('intern_flow.sq_student_id'),
    team_id BIGINT REFERENCES intern_flow.Team(team_id),
    first_name VARCHAR(70) NOT NULL,
    last_name VARCHAR(70) NOT NULL,
    email VARCHAR(50) NOT NULL,
    registration_date timestamp WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
    );


CREATE TABLE IF NOT EXISTS intern_flow.Mentor (
    mentor_id BIGINT PRIMARY KEY DEFAULT NEXTVAL('intern_flow.sq_mentor_id'),
    first_name VARCHAR(70) NOT NULL,
    last_name VARCHAR(70) NOT NULL,
    email VARCHAR(50) NOT NULL,
    registration_date timestamp WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP


);


CREATE TABLE IF NOT EXISTS intern_flow.Attendance (
    attendance_id BIGINT PRIMARY KEY DEFAULT NEXTVAL('intern_flow.sq_attendance_id'),
    student_id BIGINT REFERENCES intern_flow.Student(student_id),
    mentor_id BIGINT REFERENCES intern_flow.Mentor(mentor_id),
    date timestamp WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(10)
);


CREATE TABLE IF NOT EXISTS intern_flow.Grades (
    grade_id BIGINT PRIMARY KEY DEFAULT NEXTVAL('intern_flow.sq_grade_id'),
    student_id BIGINT REFERENCES intern_flow.Student(student_id),
    mentor_id BIGINT REFERENCES intern_flow.Mentor(mentor_id),
    grade_value INT,
    grade_dimension VARCHAR(50),
    comment VARCHAR(255)
);


CREATE TABLE IF NOT EXISTS intern_flow.Activities (
    activity_id BIGINT PRIMARY KEY DEFAULT NEXTVAL('intern_flow.sq_activity_id'),
    activity_name VARCHAR(50)
);


-- Assuming each team can have only one activity
CREATE TABLE IF NOT EXISTS intern_flow.Team_activities (
    team_id BIGINT PRIMARY KEY REFERENCES intern_flow.Team(team_id),
    activity_id BIGINT REFERENCES intern_flow.Activities(activity_id)
);

