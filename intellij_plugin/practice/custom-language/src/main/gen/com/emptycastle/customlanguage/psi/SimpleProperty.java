// This is a generated file. Not intended for manual editing.
package com.emptycastle.customlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface SimpleProperty extends SimpleNamedElement {

  @Nullable
  String getKey();

  @Nullable
  String getValue();

  @Nullable
  String getName();

  @NotNull
  PsiElement setName(@NotNull String newName);

  @Nullable
  PsiElement getNameIdentifier();

  @NotNull
  ItemPresentation getPresentation();

}
