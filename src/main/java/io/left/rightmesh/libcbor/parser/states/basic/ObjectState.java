package io.left.rightmesh.libcbor.parser.states.basic;

import io.left.rightmesh.libcbor.parser.RxParserException;

/**
 * ObjectState is a generic state that deserialize a single object.
 * 
 * @author Lucien Loiseau on 03/09/18.
 */

public abstract class ObjectState<T> extends ParserState {
    public abstract ParserState onSuccess(T obj) throws RxParserException;
}