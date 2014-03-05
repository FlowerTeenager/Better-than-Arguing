package FlowerTeenager.BetterThanArguing.age

trait Age {

  def name: String = "Age of " + category + " " + tierName

  def category: String = ""

  def tierNumber: Int = 0

  def tierSubject: String = ""

  def tierName: String = "Tier " + tierNumber.toString + " : " + tierSubject

 }
