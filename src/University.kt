class University {
    private val Student = mutableSetOf<Student>()
    fun enrolStudent(student: Student){
        Student.add(student)
    }

    fun findStudentById(id: Int): Student?{
        return Student.find { it.id == id }
    }
    }