/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.patch;

import com.facebook.thrift.type.TypeList;
import java.util.ArrayList;
import java.util.List;

public class __fbthrift_TypeList_0c92010c implements TypeList {

  private static List<TypeMapping> list = new ArrayList<>();

  static {
    list.add(new TypeList.TypeMapping("test.dev/fixtures/patch/MyData", "test.fixtures.patch.MyData"));
    list.add(new TypeList.TypeMapping("test.dev/fixtures/patch/InnerUnion", "test.fixtures.patch.InnerUnion"));
    list.add(new TypeList.TypeMapping("test.dev/fixtures/patch/MyUnion", "test.fixtures.patch.MyUnion"));
    list.add(new TypeList.TypeMapping("test.dev/fixtures/patch/MyStruct", "test.fixtures.patch.MyStruct"));
    list.add(new TypeList.TypeMapping("test.dev/fixtures/patch/MyDataFieldPatch", "test.fixtures.patch.MyDataFieldPatch"));
    list.add(new TypeList.TypeMapping("test.dev/fixtures/patch/MyDataPatch", "test.fixtures.patch.MyDataPatch"));
    list.add(new TypeList.TypeMapping("test.dev/fixtures/patch/InnerUnionFieldPatch", "test.fixtures.patch.InnerUnionFieldPatch"));
    list.add(new TypeList.TypeMapping("test.dev/fixtures/patch/InnerUnionPatch", "test.fixtures.patch.InnerUnionPatch"));
    list.add(new TypeList.TypeMapping("test.dev/fixtures/patch/MyUnionFieldPatch", "test.fixtures.patch.MyUnionFieldPatch"));
    list.add(new TypeList.TypeMapping("test.dev/fixtures/patch/MyUnionPatch", "test.fixtures.patch.MyUnionPatch"));
    list.add(new TypeList.TypeMapping("test.dev/fixtures/patch/MyStructFieldPatch", "test.fixtures.patch.MyStructFieldPatch"));
    list.add(new TypeList.TypeMapping("test.dev/fixtures/patch/MyStructFieldN21Patch", "test.fixtures.patch.MyStructFieldN21Patch"));
    list.add(new TypeList.TypeMapping("test.dev/fixtures/patch/MyStructFieldN22Patch", "test.fixtures.patch.MyStructFieldN22Patch"));
    list.add(new TypeList.TypeMapping("test.dev/fixtures/patch/MyStructFieldN23Patch", "test.fixtures.patch.MyStructFieldN23Patch"));
    list.add(new TypeList.TypeMapping("test.dev/fixtures/patch/MyStructPatch", "test.fixtures.patch.MyStructPatch"));
  }

  @java.lang.Override
  public List<TypeList.TypeMapping> getTypes() {
    return list;
  }
}