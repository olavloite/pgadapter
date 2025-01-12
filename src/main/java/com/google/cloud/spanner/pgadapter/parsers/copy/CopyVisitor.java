/* Generated By:JavaCC: Do not edit this line. CopyVisitor.java Version 7.0.11 */
package com.google.cloud.spanner.pgadapter.parsers.copy;

public interface CopyVisitor {
  public Object visit(SimpleNode node, Object data);

  public Object visit(ASTStart node, Object data);

  public Object visit(ASTCopyStatement node, Object data);

  public Object visit(ASTQualifiedName node, Object data);

  public Object visit(ASTColumnList node, Object data);

  public Object visit(ASTColumnElement node, Object data);

  public Object visit(ASTCopyDirection node, Object data);

  public Object visit(ASTFilename node, Object data);

  public Object visit(ASTCopyOptions node, Object data);

  public Object visit(ASTCopyOptionList node, Object data);

  public Object visit(ASTCopyOptionElement node, Object data);

  public Object visit(ASTFormatType node, Object data);

  public Object visit(ASTID node, Object data);

  public Object visit(ASTSingleChar node, Object data);

  public Object visit(ASTBoolean node, Object data);
}
/* JavaCC - OriginalChecksum=893c4444b3575abc83ad4333b2332301 (do not edit this line) */
