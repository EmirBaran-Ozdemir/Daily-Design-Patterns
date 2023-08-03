# Singleton
Sometimes it's important to have only one instance for a class. For example, in a system there should be only one window manager (only a file system or only a print spooler). Usually singletons are used for centralized management of internal or external resources and they provide a global point of access to themselves.

The singleton pattern is one of the simplest design patterns: it involves only one class which is responsible to make sure there is no more than one instance; it does it by instantiating itself and in the same time it provides a global point of access to that instance. By doing it, the singleton class ensures the same instance can be used from everywhere, preventing direct invocation of the singleton constructor.

## Intent
Ensure that only one instance of a class is created.
Provide a global point of access to the object.

## Implementation
The implementation involves a static member in the Singleton class which keeps the reference to the instance, a private constructor and a static public method that returns the static member reference.

[source](https://www.oodesign.com/singleton-pattern)
