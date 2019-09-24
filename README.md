This is not how type classes work.
Type classes create no types, so you can't declare variables with the class name. Type classes act as bounds on type parameters,
but the type parameters must be instantiated with a concrete type, not the type class itself. (vs Traits)

---------------------

Here are some benefits:

Typeclasses can very easily represent notions that are quite difficult to represent in the presence of subtyping, such as equality and ordering. Exercise: create a small class/trait hierarchy and try to implement .equals on each class/trait in such a way that the operation over arbitrary instances from the hierarchy is properly reflexive, symmetric, and transitive.

Typeclasses allow you to provide evidence that a type outside of your "control" conforms with some behavior. Someone else's type can be a member of your typeclass.

You cannot express "this method takes/returns a value of the same type as the method receiver" in terms of subtyping, but this [very useful] constraint is straightforward using typeclasses. This is the f-bounded types problem.

All operations defined on a trait require an instance; there is always a this argument. So you cannot define for example a fromString(s:String): Foo method on trait Foo in such a way that you can call it without an instance of Foo. In Scala this manifests as people desperately trying to abstract over companion objects. But it is straightforward with a typeclass, as illustrated by the zero element in this monoid example.

Typeclasses can be defined inductively; for example, if you have a JsonCodec[Woozle] you can get a JsonCodec[List[Woozle]] for free. The example above illustrates this for "things you can add together".

Kind of a lot to swallow, but I hope this helps.