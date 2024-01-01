# README

This is a basic study to see the effects of different Transactional annotations. 

## Scenarios

### Scenario 1:
Play with the propagation level of this pay method.

You can arrange it like MANDATORY, REQUIRED, SUPPORTS, REQUIRES_NEW, NEVER, NOT_SUPPORTED to see the difference effects that they bring.

### Scenario 2:
Arrange both the order and pay methods' transactional annotations as default, and throws an exception.

What happened then?

There is an exception in pay method, but all the data was already written to database.

Why?

Because, rollback was not triggered in checked exceptions, so for these kind of exception, we need to make a definition in Transactional annotation like rollbackFor.

We do not need to do this in runtime exceptions because they can easily trigger rollback. To see this, let's throw a runtime exception instead of filenotfoundexception. Now, look the rollback is done.