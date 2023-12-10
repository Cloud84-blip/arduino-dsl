package model

case class State(name: String, transitions: List[Transition], var actions: List[Action]) {
  def addAction(action: Action): State = {
    this.copy(actions = this.actions :+ action)
  }
}
