package training.crud.datajpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

  private StudentRepository studentRepository;

  @Autowired
  public StudentServiceImpl(StudentRepository theStudentRepository) {
    studentRepository = theStudentRepository;
  }

  @Override
  public List<Student> findAll() {
    return studentRepository.findAll();
  }

  @Override
  public Student findById(int theId) {
    Optional<Student> result = studentRepository.findById(theId);

    Student theStudent = null;

    if (result.isPresent()) {
      theStudent = result.get();
    } else {
      // we didn't find the Student
      throw new RuntimeException("Did not find Student id - " + theId);
    }

    return theStudent;
  }

  @Override
  public void save(Student theStudent) {
    studentRepository.save(theStudent);
  }

  @Override
  public void deleteById(int theId) {
    studentRepository.deleteById(theId);
  }

}
