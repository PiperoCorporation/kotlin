// "Add explicit import" "true"

open class Bar {
    companion object {
        object FromBarCompanion {
            fun foo() = 42
        }
    }
}

class Foo : Bar() {
    val a = <caret>FromBarCompanion::foo
}