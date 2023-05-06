ALTER TABLE course ADD CONSTRAINT fk_course_dayCours FOREIGN KEY (idd) REFERENCES dayCours(idd);
ALTER TABLE course ADD CONSTRAINT fk_course_hourCours FOREIGN KEY (idh) REFERENCES hourCours(idh);
ALTER TABLE course ADD CONSTRAINT fk_course_typeCours FOREIGN KEY (idty) REFERENCES typeCours(idty);
ALTER TABLE course ADD CONSTRAINT fk_course_teacher FOREIGN KEY (idt) REFERENCES teacher(idt);
ALTER TABLE course ADD CONSTRAINT fk_course_levels FOREIGN KEY (idl) REFERENCES levels(idl);