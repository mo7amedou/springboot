ALTER TABLE inscription ADD CONSTRAINT fk_inscription_session FOREIGN KEY (idss) REFERENCES sessions(idss);
ALTER TABLE inscription ADD CONSTRAINT fk_inscription_student FOREIGN KEY (idst) REFERENCES student(idst);
ALTER TABLE inscription ADD CONSTRAINT fk_inscription_levels FOREIGN KEY (idl) REFERENCES levels(idl);