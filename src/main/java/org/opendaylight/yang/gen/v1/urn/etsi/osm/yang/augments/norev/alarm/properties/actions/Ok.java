package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.alarm.properties.actions;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.alarm.properties.Actions;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * list ok {
 *   key url;
 *   leaf url {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/alarm-properties/actions/ok</i>
 * 
 * <p>To create instances of this class use {@link OkBuilder}.
 * @see OkBuilder
 * @see OkKey
 *
 */
public interface Ok
    extends
    ChildOf<Actions>,
    Augmentable<Ok>,
    Identifiable<OkKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ok");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.alarm.properties.actions.Ok> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.alarm.properties.actions.Ok.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>url</code>, or <code>null</code> if not present
     */
    @Nullable String getUrl();
    
    @Override
    OkKey key();

}

