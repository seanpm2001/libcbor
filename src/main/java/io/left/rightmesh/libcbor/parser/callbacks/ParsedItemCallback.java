package io.left.rightmesh.libcbor.parser.callbacks;

import io.left.rightmesh.libcbor.ParserInCallback;
import io.left.rightmesh.libcbor.parser.RxParserException;

/**
 * @author Lucien Loiseau on 28/01/19.
 */
public interface ParsedItemCallback<T> {
    void onItemParsed(ParserInCallback parser, T obj) throws RxParserException;
}
