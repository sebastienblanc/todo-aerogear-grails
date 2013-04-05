package todo

class Task {
    String title
    String description
    String date
    static hasMany = [tags:Tag]
    static hasOne = [project:Project]
    static constraints = {
    }
}
