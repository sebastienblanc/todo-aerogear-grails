package todo

class Tag {
    String title
    String style
    static hasMany = [tasks:Task]
    static belongsTo = Task
    static constraints = {
    }
}
