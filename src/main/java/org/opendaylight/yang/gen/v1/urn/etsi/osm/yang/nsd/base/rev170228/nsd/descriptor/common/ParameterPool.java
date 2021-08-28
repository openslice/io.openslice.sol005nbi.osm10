package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Pool of parameter values which must be pulled from during configuration
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list parameter-pool {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   container range {
 *     leaf start-value {
 *       type uint32;
 *     }
 *     leaf end-value {
 *       type uint32;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/parameter-pool</i>
 * 
 * <p>To create instances of this class use {@link ParameterPoolBuilder}.
 * @see ParameterPoolBuilder
 * @see ParameterPoolKey
 *
 */
public interface ParameterPool
    extends
    ChildOf<NsdDescriptorCommon>,
    Augmentable<ParameterPool>,
    Identifiable<ParameterPoolKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("parameter-pool");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.ParameterPool> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.ParameterPool.class;
    }
    
    /**
     * Name of the configuration value pool
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Create a range of values to populate the pool with
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range</code> <code>range</code>, or <code>null</code> if not present
     */
    @Nullable Range getRange();
    
    @Override
    ParameterPoolKey key();

}

