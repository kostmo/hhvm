#
# Autogenerated by Thrift
#
# DO NOT EDIT
#  @generated
#

from __future__ import annotations

from abc import ABCMeta
import typing as _typing

import folly.iobuf as _fbthrift_iobuf

import apache.thrift.metadata.thrift_types as _fbthrift_metadata
from thrift.python.serializer import serialize_iobuf, deserialize, Protocol
from thrift.python.server import ServiceInterface, oneway, PythonUserException

import test.fixtures.basic.module.thrift_types
import test.fixtures.basic.module.thrift_metadata

class MyServiceInterface(
    ServiceInterface,
    metaclass=ABCMeta
):

    @staticmethod
    def service_name() -> bytes:
        return b"MyService"

    # pyre-ignore[3]: it can return anything
    def getFunctionTable(self) -> _typing.Mapping[bytes, _typing.Callable[..., _typing.Any]]:
        functionTable = {
            b"query": self._fbthrift__handler_query,
        }
        return {**super().getFunctionTable(), **functionTable}

    @staticmethod
    def __get_thrift_name__() -> str:
        return "module.MyService"

    @staticmethod
    def __get_metadata__() -> _fbthrift_metadata.ThriftMetadata:
        return test.fixtures.basic.module.thrift_metadata.gen_metadata_service_MyService()

    @staticmethod
    def __get_metadata_service_response__() -> _fbthrift_metadata.ThriftServiceMetadataResponse:
        return test.fixtures.basic.module.thrift_metadata._fbthrift_metadata_service_response_MyService()



    async def query(
            self,
            u: test.fixtures.basic.module.thrift_types.MyUnion
        ) -> test.fixtures.basic.module.thrift_types.MyStruct:
        raise NotImplementedError("async def query is not implemented")

    async def _fbthrift__handler_query(self, args: _fbthrift_iobuf.IOBuf, protocol: Protocol) -> _fbthrift_iobuf.IOBuf:
        args_struct = deserialize(test.fixtures.basic.module.thrift_types._fbthrift_MyService_query_args, args, protocol)
        value = await self.query(args_struct.u,)
        return_struct = test.fixtures.basic.module.thrift_types._fbthrift_MyService_query_result(success=value)

        return serialize_iobuf(return_struct, protocol)

