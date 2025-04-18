package u02

import u03.Optionals.*

object Modules extends App:

  // An ADT: type + module
  enum Person:
    case Student(name: String, year: Int)
    case Teacher(name: String, course: String)

  object Person:
    def name(p: Person): String = p match
      case Student(n, _) => n
      case Teacher(n, _) => n
      
    def course(p: Person): String = p match
      case Teacher(n, c) => c
      case Student(n, y) => "Student!"

    def isStudent(p: Person): Boolean = p match
      case Student(_, _) => true
      case _ => false

  println(Person.name(Person.Student("mario", 2015)))

  import Person.*

  println(name(Student("mario", 2015)))

  // a method outside the Person module
  def isStudent(p: Person): Boolean = p match
    case Student(_, _) => true
    case _ => false

  println(isStudent(Student("mario", 2015)))
end Modules
