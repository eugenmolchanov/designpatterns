package com.yauhenmalchanau.education.patterns.behavioral.interpreter;

import java.util.List;

/**
 * The pattern defines the grammar of a particular language in an object-oriented way which can be
 * evaluated by the interpreter itself. A NonTerminalExpression may have one or more other
 * AbstractExpressions associated in it, therefore it can be recursively interpreted. In the end,
 * the process of interpretation has to finish with a TerminalExpression that will return the
 * result. The role of the client is to create or use an already created abstract syntax tree, which
 * is nothing more than a sentence defined in the created language.
 */
public interface Expression {

  List<String> interpret(Context context);

}
