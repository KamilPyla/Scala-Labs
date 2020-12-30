
object task_2 extends App {

  val subjects = List(

    ("Matematyka dyskretna", 1, 1, 4, false),

    ("Algorytmy i struktury danych", 1, 2, 6, true),

    ("Teoria obwodów i sygnałów", 1, 3, 3, false),

    ("Układy elektroniczne", 1, 4, 5, true),

    ("Bazy danych 1", 1, 5, 5, false),

    ("Inżynieria oprogramowania", 1, 6, 5, true),

    ("Komputeryzacja pomiarów", 1, 7, 3, false),

    ("Modelowanie procesrów fizycznych", 2, 1, 5, true),

    ("Techniki mikroprocesorowe", 2, 2, 5, false),

    ("Programowanie zespołowe", 2, 3, 5, false)


  )

  println("Bachalor: " + subjects.filter(_._2 == 1))
  println()
  println("Master: " + subjects.filter(_._2 == 2))
  println()
  println("Subjects with exams and ECTS > 5  " + subjects.filter(_._4 > 5).filter(_._5 == true))
  println()
  println("Only subjects and ECTS: " + subjects.map(sub => (sub._1, sub._4)))
  println()
  println("Subject key ECTS  " + subjects.groupBy(subject => subject._4))
  println()
  println("Sum of bachelor's ECTS:  " + subjects.filter(_._2 == 1).map(_._4).sum)
  println()
  println("Sum of master's ECTS without exams:  " + subjects.filter(_._2 == 1).filter(_._5 == false).map(_._4).sum)
  println()
  println("Sorted list of subject for bachelors degree: " + subjects.filter(_._2 == 1).sortBy(_._1))


  // list of subjects for bachalor degree

  // list of subjects for masters degree

  // list of subjects with exams and ECTS > 5

  // list of subjects just with (name, ects)

  // list of subjects, where key is number of ECTS and value is list of subjects for that ECTS count (grouped by ECTS)

  // number of ECTS points of all bachalors subjects

  // number of ECTS points of all masters subjects, which doesn't have exam

  // sorted list of subjects (by name) for bachalors degree

}
