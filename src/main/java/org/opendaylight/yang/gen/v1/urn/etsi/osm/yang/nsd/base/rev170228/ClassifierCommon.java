package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.classifier.common.MatchAttributes;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.classifier.common.MatchAttributesKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * grouping classifier-common {
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf rsp-id-ref {
 *     type leafref {
 *       path ../../rsp/id;
 *     }
 *   }
 *   list match-attributes {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf ip-proto {
 *       type uint8;
 *     }
 *     leaf source-ip-address {
 *       type inet:ip-address;
 *     }
 *     leaf destination-ip-address {
 *       type inet:ip-address;
 *     }
 *     leaf source-port {
 *       type inet:port-number;
 *     }
 *     leaf destination-port {
 *       type inet:port-number;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/classifier-common</i>
 *
 */
public interface ClassifierCommon
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("classifier-common");

    @Override
    Class<? extends ClassifierCommon> implementedInterface();
    
    /**
     * Identifier for the classifier rule.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Name of the classifier.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * A reference to the RSP.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>rspIdRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getRspIdRef();
    
    /**
     * List of match attributes.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>matchAttributes</code>, or <code>null</code> if not present
     */
    @Nullable Map<MatchAttributesKey, MatchAttributes> getMatchAttributes();
    
    /**
     * @return <code>java.util.Map</code> <code>matchAttributes</code>, or an empty list if it is not present
     */
    default @NonNull Map<MatchAttributesKey, MatchAttributes> nonnullMatchAttributes() {
        return CodeHelpers.nonnull(getMatchAttributes());
    }

}

