public enum Estado {
    DESPEGANDO,
    VOLANDO,
    ATERRIZANDO,
    GUARDADO,
    SINASIGNAR,
}

/*
An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

*/