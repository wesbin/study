package com.intellij.sql.psi;

import com.intellij.database.model.DasColumn;
import com.intellij.database.model.PsiColumn;
import com.intellij.database.symbols.PsiColumnWithSymbol;
import com.intellij.util.ArrayFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @author Gregory.Shrago
 */
public interface SqlColumnDefinition extends SqlElement, PsiColumn, SqlTypedDefinition, PsiColumnWithSymbol {

  SqlColumnDefinition[] EMPTY_ARRAY = new SqlColumnDefinition[0];
  ArrayFactory<SqlColumnDefinition> ARRAY_FACTORY = count -> count == 0 ? EMPTY_ARRAY : new SqlColumnDefinition[count];

  @Override
  @NotNull
  default DasColumn getDasObject() {
    return this;
  }

  @Override
  @Nullable
  SqlNameElement getNameElement();

  @NotNull
  List<SqlConstraintDefinition> getConstraints();

  @Nullable
  SqlTableKeyDefinition getPrimaryKey();

  @Nullable
  SqlForeignKeyDefinition getForeignKey();

  @Nullable
  SqlTableKeyDefinition getUniqueKey();

  @Nullable
  SqlClause getGeneratedClause();
}
