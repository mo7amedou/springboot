ALTER TABLE noteCours ADD CONSTRAINT fk_noteCours_student FOREIGN KEY (idst) REFERENCES student(idst);
ALTER TABLE noteCours ADD CONSTRAINT fk_noteCours_course FOREIGN KEY (idc) REFERENCES course(idc);
