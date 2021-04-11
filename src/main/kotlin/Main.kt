fun main() {
    val relationship1 =
        "father's father's mother's brother's son's son's daughter" //this variable describes a relationship to a third cousin. Used as a test case for calculateRelationship
    val relationship2 = "father's father's mother's brother's son's son"
    calculateRelationship(relationship1)//third cousin
    calculateRelationship(relationship2)//second cousin once removed
    val x = 5
    if(x.compareTo(6)==0){
        //they are equal
    }
    else if (x.compareTo(6)==-1){
        //its less than, do someting
    }
}

fun calculateRelationship(relationship: String)/*: String*/ {
    val relationshipSanitized = relationship.toLowerCase()
    val listOfAcceptableRelationship = listOf(
        "father", "mother",
        "brother", "sister",
        "son", "daughter"
    )

}
