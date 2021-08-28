package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.initial.config.primitive.PrimitiveType;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Initial set of configuration primitives.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * list initial-config-primitive {
 *   key seq;
 *   leaf seq {
 *     type uint64;
 *   }
 *   choice primitive-type {
 *     case primitive-definition {
 *       leaf name {
 *         type string;
 *       }
 *       leaf execution-environment-ref {
 *         type leafref {
 *           path ../../execution-environment-list/id;
 *         }
 *       }
 *       uses primitive-parameter-value;
 *       leaf user-defined-script {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/vnfc-configuration/initial-config-primitive</i>
 * 
 * <p>To create instances of this class use {@link InitialConfigPrimitiveBuilder}.
 * @see InitialConfigPrimitiveBuilder
 * @see InitialConfigPrimitiveKey
 *
 */
public interface InitialConfigPrimitive
    extends
    ChildOf<VnfcConfiguration>,
    Augmentable<InitialConfigPrimitive>,
    Identifiable<InitialConfigPrimitiveKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("initial-config-primitive");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.InitialConfigPrimitive> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.InitialConfigPrimitive.class;
    }
    
    /**
     * Sequence number for the configuration primitive.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>seq</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getSeq();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.initial.config.primitive.PrimitiveType</code> <code>primitiveType</code>, or <code>null</code> if not present
     */
    @Nullable PrimitiveType getPrimitiveType();
    
    @Override
    InitialConfigPrimitiveKey key();

}

