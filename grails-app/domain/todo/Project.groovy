package todo

class Project {
    String title
    String style
    static hasMany = [tasks:Task]
    static constraints = {
    }
}
